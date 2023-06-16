import javax.sound.sampled.*;

public class SoundUtils {

  public static float SAMPLE_RATE = 8000f;
  

  public static void tone(int hz, int msecs) 
     throws LineUnavailableException 
  {
     tone(hz, msecs, 1.0);
  }

  public static void tone(int hz, int msecs, double vol)
      throws LineUnavailableException 
  {
    byte[] buf = new byte[1];
    AudioFormat af = 
        new AudioFormat(
            SAMPLE_RATE, // sampleRate
            8,           // sampleSizeInBits
            1,           // channels
            true,        // signed
            false);      // bigEndian
    SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
    sdl.open(af);
    sdl.start();
    for (int i=0; i < msecs*8; i++) {
      double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
      buf[0] = (byte)(Math.sin(angle) * 127.0 * vol);
      sdl.write(buf,0,1);
    }
    sdl.drain();
    sdl.stop();
    sdl.close();
  }

  public static void main(String[] args) throws Exception {
	  final int DO = 262;
	  final int RE = 294;
	  final int MI = 330;
	  final int FA = 349;
	  final int SO = 392;
	  final int LA = 440;
	  final int SI = 494;
	  final int DO_H = 523;
	  final int RE_H = 587;
	  final int MI_H = 659;
	  final int FA_H = 698;
	  final int SO_H = 784;
	  final int LA_H = 880;
	  final int SI_H = 988;
	  int[] happyBirthday = { SO, SO,LA,SO,DO_H,SI,SO,SO,LA,RE_H,DO_H,SO,
              SO,SO_H,MI_H,DO_H,SI,LA,FA_H,FA_H,MI_H,DO_H,RE_H,DO_H };
	  for (int i = 0; i < happyBirthday.length; i++)
      {
          System.out.println(happyBirthday[i]+"  ");
          SoundUtils.tone(happyBirthday[i],600,1);
      }
	  
    

  }
}
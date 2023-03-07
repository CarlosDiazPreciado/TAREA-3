import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sonido {
    public static void main(String[] args) {
        try {
            File archivo = new File("C:\\Users\\Carlos\\OneDrive\\Escritorio\\ESTUDIO\\CUARTO SEMESTRE\\PROGRAMACION MOVILES\\TAREA 3\\Mark-Dekoda-Illusion-Original-Mix-Scythe-Recordings.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(archivo));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.out.println("Error al reproducir la canción: " + e.getMessage());
        }
    }
}

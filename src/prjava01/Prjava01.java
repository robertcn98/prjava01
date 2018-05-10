package prjava01;

/**
 *
 * @author rocrno1718dam2vib (a on XYZ és el teu nom d'usuari Github)
 */
import java.io.*;

public class Prjava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer00.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");
            bw.newLine();
            bw.write("  <head>");
            bw.newLine();
            bw.write("    <title>");
            bw.newLine();
            bw.write("      Nova p&agrave;gina  web");
            bw.newLine();
            bw.write("    </title>");
            bw.newLine();
            bw.write("  </head>");
            bw.newLine();
            bw.write("  <body>");
            bw.write("    <h1>DAM2 m08uf4pr2</h1>");
            bw.newLine();
            bw.newLine();
            bw.write("    Nova p&agrave;gina web");
            bw.newLine();
            bw.write("  </body>");
            bw.newLine();
            bw.write("</html>");
            bw.newLine();
            bw.close();
        }
    }
}

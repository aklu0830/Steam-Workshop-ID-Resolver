import com.sun.javaws.IconUtil;
import sun.swing.ImageIconUIResource;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.net.URI;

public class gui {



    public void run() throws Exception {
        ImageIcon ic = new ImageIcon("src/stm.png");

        JFrame f;

        f= new JFrame();
        String input = (String) JOptionPane.showInputDialog(f,"Enter Steam Workshop Resource ID","Steam ResourceID Finder",
                JOptionPane.INFORMATION_MESSAGE,ic,null,"");
        if(input.equals("")) {
            return;
        } else {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("https://steamcommunity.com/sharedfiles/filedetails/?id=" + input));

        }




    }

}

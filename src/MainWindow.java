import javax.swing.*;
import java.awt.*;

class MainWindow extends JWindow    
{
    public MainWindow()
    {
        super();
        var screensize = Toolkit.getDefaultToolkit().getScreenSize();
        super.setSize(screensize.width, screensize.height);
        super.setLocation(0, 0);
    }
    
}

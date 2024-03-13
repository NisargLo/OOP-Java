/*
    Create interface EventListener with performEvent() method. 
    Create MouseListener interface which inherits EventListener along with mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods. 
    Also create KeyListener interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
    WAP to create EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces.
 */

public class L7_4 {
    public static void main(String[] args) {
        EventDemo ed=new EventDemo();
        ed.performEvent();
        ed.mouseClicked();
        ed.mousePressed();
        ed.mouseReleased();
        ed.mouseMoved();
        ed.mouseDragged();
        ed.keyPressed();
        ed.keyReleased();
    }
}

interface EventListener {
    void performEvent();
}

interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends  EventListener{
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {
    public void performEvent(){
        System.out.println("\nEvent Performed");
    }

    public void mouseClicked(){
        System.out.println("\nMouse Clicked");
    }

    public void mousePressed(){
        System.out.println("\nMouse Pressed");
    }

    public void mouseReleased(){
        System.out.println("\nMouse Released");
    }

    public void mouseMoved(){
        System.out.println("\nMouse Moved");
    }
    
    public void mouseDragged(){
        System.out.println("\nMouse Dragged");
    }

    public void keyPressed(){
        System.out.println("\nKey Pressed");
    }
    
    public void keyReleased(){
        System.out.println("\nKey Released\n");
    }
}
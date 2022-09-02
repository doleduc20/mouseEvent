package controller;

import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

import view.MouseeventView;

public class MouseeventController implements MouseInputListener {
    private MouseeventView mouseeventView;
    public MouseeventController(MouseeventView mouseeventView){
        this.mouseeventView = mouseeventView;

    }
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        this.mouseeventView.click();
        
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        this.mouseeventView.mouseEnter();
       
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        this.mouseeventView.mouseExit();
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mouseeventView.mouseMove(x, y);
        
    }
    
}

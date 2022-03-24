package Camello_1;
import acm.graphics.*;
import acm.program.*;
import javax.swing.*;

public class Add2Program extends GraphicsProgram {

    public static void main(String[] args) {
        new Add2Program().start(args);
    }

    public void run() {
        GImage fondo = new GImage("Camello_1\\desert2.jpg");//ruta del fondo
        add(fondo,0,-85);//posicion del fondo x,y
        fondo.setSize(900,558);//tamaño del fondo

        camell_rapid ibiza = new camell_rapid("Ibiza");
        camell_fondista tolsa = new camell_fondista("Tolsa");
        camell_flipat serrain = new camell_flipat("serrain");
        camello_1 test = new camello_1("test");
        camell_flipat flipat= new camell_flipat("flipat");
        camell_antisenar antisenar = new camell_antisenar("antisenar");


        test.mover();

        GImage pozo1 = new GImage("Camello_1\\pozo.png");
        add(pozo1,840,10);
        GImage pozo2 = new GImage("Camello_1\\pozo.png");
        add(pozo2,840,90);
        GImage pozo3 = new GImage("Camello_1\\pozo.png");
        add(pozo3,840,170);
        GImage pozo4 = new GImage("Camello_1\\pozo.png");
        add(pozo4,840,250);
        GImage pozo5 = new GImage("Camello_1\\pozo.png");
        add(pozo5,840,330);
        GImage pozo6 = new GImage("Camello_1\\pozo.png");
        add(pozo6,840,410);


        setSize(900, 580);


        for (int i = 0; i < 870; i++) {
            for (int j = 0; j < 6; j++) {

                GLabel label = new GLabel("-");
                label.setFont("SansSerif-30");
                double x = (getWidth());
                double y = (getHeight());
                x = x + i;
                y = y + j * 80;
                add(label, x, y);
            }
        }

        GImage img1 = new GImage("Camello_1\\tolsa.png");
        GImage img = new GImage("Camello_1\\ibiza.png");
        GImage img2 = new GImage("Camello_1\\serrainat.png");
        GImage img3 = new GImage("Camello_1\\cuac.png");
        GImage img4 = new GImage("Camello_1\\otronombre.png");
        GImage img5 = new GImage("Camello_1\\suputamadre.png");

        while (!ibiza.ha_ganado()&&!tolsa.ha_ganado()&&!serrain.ha_ganado()&&!antisenar.ha_ganado()&&!flipat.ha_ganado()&&!test.ha_ganado()){
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            add(img,ibiza.get_pos(),10);
            add(img1,tolsa.get_pos(),90);
            add(img2,serrain.get_pos(),170);
            add(img3,test.get_pos(),250);
            add(img4,antisenar.get_pos(),330);
            add(img5,flipat.get_pos(),410);

            ibiza.mover();
            tolsa.mover();
            serrain.mover();
            test.mover();
            antisenar.mover();
            flipat.mover();

        }
    }
    public int getHeight() {
        return 80;
    }
    public int getWidth() {
        return 0;
    }
}
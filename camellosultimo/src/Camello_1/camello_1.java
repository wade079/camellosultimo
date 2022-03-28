package Camello_1;

public class camello_1 {

    private String nombre;
    protected int pos = 0;
    private final int pos_final = 900;
    protected int min = 1;
    protected int max = 15;

    public camello_1(String nombre) {//Metodo constructor para asignar un nombre al camello

        this.nombre = nombre;

    }

    public void mover() {//Accion mover al camello


        this.pos = this.pos + getRandomNumber(min, max);
    }

    public int get_pos() {//Getter para obtener la posicion actual del camello

        return this.pos;

    }

    public boolean ha_ganado() {//Comprobador para saber si el camello a llegado a la meta

        return this.pos >= 840;
    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
class camell_rapid extends camello_1 {

    public camell_rapid(String nombre) {
        super(nombre);
    }

    public void mover() {

        int pos_movidas = getRandomNumber(min,max);

        if (pos_movidas==max) this.pos = this.pos + pos_movidas * 2;
        else{
            this.pos=this.pos+pos_movidas;
        }
    }
}
class camell_fondista extends camello_1{

    public int min = 5;
    public int max = 10;

    public camell_fondista(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        this.pos = this.pos + getRandomNumber(min, max);
    }
}
class camell_antisenar extends camello_1{


    public camell_antisenar(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        int pos_movidas = getRandomNumber(min,max);
        if (pos_movidas%2==0){
            this.pos = this.pos +pos_movidas;
        }else{
            this.pos = this.pos +2;
        }
    }
}

class camell_flipat extends camello_1{

    private boolean avanza = true;


    public camell_flipat(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {

        int pos_movidas = getRandomNumber(min,max);

        if (avanza){
            this.pos=this.pos+(pos_movidas*2);
            avanza=false;
        }else{
            this.pos=this.pos-(pos_movidas/2);

            if (this.pos<=0 ){
                this.pos=0;
            }
            avanza=true;
        }
    }
}

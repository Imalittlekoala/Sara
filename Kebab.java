package main.classi;

public class Kebab{
    {
        private Boolean pita;
        private String patatine;
        private Boolean carne;
        private Boolean insalata;
        private Boolean pomodoro;
        private Boolean sanGennaro;

    public Kebab(Boolean pita, String patatine, Boolean carne, Boolean insalata, Boolean pomodoro, Boolean sanGennaro) {
        this.pita = pita;
        this.patatine = patatine;
        this.carne = carne;
        this.insalata = insalata;
        this.pomodoro = pomodoro;
        this.sanGennaro = sanGennaro;
    }

        public void setSanGennaro(Boolean sanGennaro) {
        this.sanGennaro = sanGennaro;
    }

        public String getSanGennaro() {
        String sanGennaro;
        if (this.sanGennaro) {
            sanGennaro = "aiutami tu";
        } else {
            sanGennaro = "facci il miracolo";
        }
        return sanGennaro;
    }

        public void setPomodoro(Boolean pomodoro) {
        this.pomodoro = pomodoro;
    }
        public String getPomodoro(){
        String pummarola;
        if(this.pomodoro){
            pummarola="con pomodoro";
        }else{
            pummarola="senza pomodoro";
        }
        return pummarola;
    }

        public void setInsalata(Boolean insalata){
        this.insalata = insalata;
    }

        public String getInsalata(){
        String salad;
        if(this.insalata){
            salad="lattuga";
        }else{
            salad="insalata mista";
        }
        return salad;
    }

        public void setCarne(Boolean carne){
        this.carne=carne;
    }

        public String getCarne() {
        String meat;
        if(this.carne){
            meat="carne di catalìcammello";
        }else{
            meat="carne di toporagno";
        }
        return meat;
    }

        public void setPatatine(String patatine){
        this.patatine=patatine;
    }

        public String getPatatine(){
        return patatine;
    }

        public void setPita(Boolean pita){
        this.pita=pita;
    }

        public String getPita(){
        String tipoDiInvolucro;
        if(this.pita){
            tipoDiInvolucro="Pita normale";
        }else{
            tipoDiInvolucro="Pita integrale";
        }
        return tipoDiInvolucro;
    }
        public void toIngredienti(){
        String ingredienti= "gli ingredienti del tuo kebab sono"+this.getSanGennaro()+","+this.getPita()
                +","+this.getPatatine()+","+this.getPomodoro()+","+this.getCarne()+","+this.getInsalata();
        System.out.println(ingredienti);
    }
}
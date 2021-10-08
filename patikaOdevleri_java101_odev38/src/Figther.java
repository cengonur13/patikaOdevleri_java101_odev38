public class Figther {
    String name;
    int damage;
    int healty;
    int weight;
    double dodge;

    public Figther(String name, int damage, int healty, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.healty = healty;
        this.weight = weight;
        if( dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }
    }

    public int hit(Figther foe){
        System.out.println("----------------");
        System.out.println(this.name+" => "+foe.name+" "+this.damage +" hasar verdi.");

        if (foe.dodge()){
            System.out.println(foe.name+" rakipten gelen hasarı engelledi!");
            return foe.healty;
        }

        if(foe.healty - this.damage < 0){
            return 0;
        }
        return foe.healty - this.damage;
    }

    public boolean dodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}

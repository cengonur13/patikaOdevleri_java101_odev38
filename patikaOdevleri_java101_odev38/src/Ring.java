public class Ring {
    Figther figther1;
    Figther figther2;
    int minWeight;
    int maxWeight;
    int roundNumber=1;
    double randomNumber;
    public Ring(Figther figther1, Figther figther2, int minWeight, int maxWeight){

        this.figther1 = figther1;
        this.figther2 = figther2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (checkWeight()){
           while (figther1.healty > 0 && figther2.healty > 0){
               System.out.println("====="+roundNumber+". ROUND=====");
               randomNumber = Math.random()*100;
               if(randomNumber <= 50){
                   figther2.healty = figther1.hit(figther2);
                   if(isWin()){
                       break;
                   }
                   figther1.healty = figther2.hit(figther1);
                   if (isWin()){
                       break;
                   }
                   printScore();
               }else {
                   figther1.healty = figther2.hit(figther1);
                   if(isWin()){
                       break;
                   }
                   figther2.healty = figther1.hit(figther2);
                   if (isWin()){
                       break;
                   }
                   printScore();
               }
               roundNumber++;
           }
        }else {
            System.out.println("Sporcu ağırlıkları, min-max değerlerine uygun değildir!");
            System.out.println(figther1.name+" ve "+figther2.name+" müsabakaya rakip olarak çıkamaz!");
        }
    }

    public boolean checkWeight(){
        return (figther1.weight >= minWeight && figther1.weight <= maxWeight)
                && (figther2.weight >= minWeight && figther2.weight <= maxWeight);
    }

    public boolean isWin(){
        if(figther1.healty == 0){
            System.out.println("Maçı kazanan : "+figther2.name);
            return true;
        }else if (figther2.healty == 0){
            System.out.println("Maçı kazanan : "+figther1.name);
            return true;
        }
        return false;
    }

    public void printScore(){
        System.out.println("------------------");
        System.out.println(figther1.name+" Kalan Can \t: "+figther1.healty);
        System.out.println(figther2.name+" Kalan Can \t: "+figther2.healty);
    }

}

interface Animal{
    void sound();
}
interface dog extends Animal{
    String sound="Bark";
}
interface cat extends Animal{
    String sound="Nyan";
}
class Sounds{
    void sounds(){
        System.out.println()
    }
}

class animalSounds implements dog,cat extends sounds{
    public static void main(String args[]) {
        cat o=new animalSounds();
        o.sound();
        //o.sound2();
        
    }
}
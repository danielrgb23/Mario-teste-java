
public class MarioPequeno implements MarioState {
    
    public MarioState pegarCogumelo() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }

    public MarioState pegarFlor() {
        System.out.println("Mario Grande com flor");
        return new MarioFogo();
    }

    public MarioState pegarPena() {
        System.out.println("Mario Grande com capa");
        return new MarioCapa();
    }

    public MarioState levarDano() {
        System.out.println("Mario morto! Game Over");
        return new MarioMorto();
    }
}

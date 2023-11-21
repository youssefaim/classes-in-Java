public class Main {
    public static void main(String[] args) {
        Player ply1 = new Player();
        ply1.name = "Cristiano Ronaldo" ;
        ply1.age = 24 ;
        ply1.post = "ST" ;
        ply1.rank = 1 ;
        ply1.club = "Real Madrid" ;
        ply1.nationality = "Portugal" ;
        ply1.ovr = 91 ;
        ply1.pass() ;
        ply1.shoot() ;
        ply1.jump() ;
        ply1.info() ;
    }
}

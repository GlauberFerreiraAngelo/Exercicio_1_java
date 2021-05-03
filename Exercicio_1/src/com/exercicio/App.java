public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro("Honda", "Civic", 2017);
        
        System.out.println("\nMarca: " + carro.getMarca()+ " modelo: " + carro.getModelo() + " ano: " + carro.getAno());
        System.out.println();
    }
}

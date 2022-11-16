public class Burger {
    private final String bun;
    private final String meat;
    private final String cheese;
    private final String greens;
    private String mayonnaise;
    private String meat2;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Классический:");
        this.printComponents();
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Диетический:");
        this.printComponents();
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String meat2) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.meat2 = meat2;
        System.out.println("Двойное мясо:");
        this.printComponents();
    }

    private void printComponents() {
            String components = "";
            components+=this.bun+"\n";

            if (this.meat2 != null){
                components+="двойное мясо \n";
            }
            else{
                components+="мясо \n";
            }

            components += this.cheese+"\n";

            components += this.greens+"\n";

            if ( this.mayonnaise != null ) {
                components += this.mayonnaise + "\n";
            }

            System.out.println(components);
    }
}


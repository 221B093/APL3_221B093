/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Bharatvanshi {
    // Abstract methods to be implemented by subclasses
    public abstract void fight();
    public abstract void obey();
    public abstract void kind();
    
    // Non-abstract method common to all Bharatvanshis
    public boolean isFighter() {
        return true;  // All Bharatvanshis are fighters
    }
}

// Concrete class Pandav
class Pandav extends Bharatvanshi {
    private String name;
    
    public Pandav(String name) {
        this.name = name;
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting!");
    }

    @Override
    public void obey() {
        System.out.println(name + " is obedient.");
    }

    @Override
    public void kind() {
        if (name.equals("Bheem")) {
            System.out.println(name + " is less kind.");
        } else {
            System.out.println(name + " is kind.");
        }
    }
}

// Concrete class Kaurav
class Kaurav extends Bharatvanshi {
    private String name;
    
    public Kaurav(String name) {
        this.name = name;
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting aggressively!");
    }

    @Override
    public void obey() {
        System.out.println(name + " is disobedient!");
    }

    @Override
    public void kind() {
        System.out.println(name + " is cruel.");
    }
}

// Concrete class Vikarn (A special Kaurav)
class Vikarn extends Kaurav {
    
    public Vikarn() {
        super("Vikarn");
    }

    @Override
    public void fight() {
        System.out.println(super.getClass().getSimpleName() + " is a noble and skilled fighter.");
    }

    @Override
    public void obey() {
        System.out.println("Vikarn is obedient.");
    }

    @Override
    public void kind() {
        System.out.println("Vikarn is kind.");
    }
}

// Main class to test the implementation
public class Mahabharat {
    public static void main(String[] args) {
        // Instantiate objects for different characters
        Bharatvanshi arjun = new Pandav("Arjun");
        Bharatvanshi bheem = new Pandav("Bheem");
        Bharatvanshi duryodhan = new Kaurav("Duryodhan");
        Bharatvanshi vikarn = new Vikarn();
        
        // Test their behavior
        arjun.fight();
        arjun.obey();
        arjun.kind();
        
        bheem.fight();
        bheem.obey();
        bheem.kind();
        
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();
        
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
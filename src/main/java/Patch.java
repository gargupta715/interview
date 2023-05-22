import java.util.*;
import java.util.stream.*;

public class Patch {
    private String name;
    private Patch requires;

    public Patch(String name, Patch requires) {
        this.name = name;
        this.requires = requires;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patch patch = (Patch) o;

        if (!name.equals(patch.name)) return false;
        return requires.equals(patch.requires);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + requires.hashCode();
        return result;
    }

    public static List<Patch> sortPatches(List<Patch> patches) {
        // TODO: add code below following 2 rules
        //  1) patch with requires == null can be at any position in result array
        //  2) patch with requires == someRequiredPatch (non-null value) can appear in the array only after someRequiredPatch
        List<Patch> result = new ArrayList<>();
        for (Patch patch : patches) {
            pachesOrders(result, patch);
        }
        return new ArrayList<>(result);
    }

    // Arrays.asList(red, blue, green, pink, yellow);
    private static void pachesOrders(List<Patch> res, Patch patch) {
        if (patch != null && patch.getRequires() != null) {
            pachesOrders(res, patch.getRequires());
        }

        if (!res.contains(patch))
            res.add(patch);
    }


    // Following code is only to execute sample test (ilustrated at https://postimg.cc/mP71m1y5)

    public static void main(String args[]) {
        // sample patch instances
        Patch blue = new Patch("BLUE", null);
        Patch red = new Patch("RED", blue);
        Patch green = new Patch("GREEN", red);
        Patch pink = new Patch("PINK", null);
        Patch yellow = new Patch("YELLOW", red);
        /*
          Blue -- Red --+-- Green
                        \-- Yellow
          Pink
        */

        // user input in random order
        List<Patch> patchesFromUser = Arrays.asList(red, blue, green, pink, yellow);
        // call of sort method
        List<Patch> sorted = sortPatches(patchesFromUser);
        // print sorted output
        IntStream.range(0, sorted.size())
                .forEach(i -> System.out.println(String.format("Result array position %d: %s", i, sorted.get(i))));
    }

    public String toString() {
        return requires == null ? name : String.format("%s (should go after %s)", name, requires);
    }

    private Patch getRequires() {
        return requires;
    }
}

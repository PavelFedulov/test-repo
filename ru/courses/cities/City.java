import java.util.ArrayList;
import java.util.List;

public class City {

    public final String name;
    public final List<Path> paths = new ArrayList<>();

    public static class Path {
        public final City city;
        public final int cost;

        public Path(City city, int cost) {
            this.city = city;
            this.cost = cost;
        }
    }

    public City(String name) {
        this.name = name;
    }

    public City(String name, List<Path> initialPaths) {
        this.name = name;
        if (initialPaths != null) {
            paths.addAll(initialPaths);
        }
    }

    public void addPath(Path path) {
        if (path != null) {
            paths.add(path);
        }
    }

    public void addPath(City city, int cost) {
        if (city != null) {
            paths.add(new Path(city, cost));
        }
    }

    public City travelBy(int n) {
        if (n <= 0) {
            return this;
        }

        City current = this;

        for (int i = 0; i < n; i++) {
            if (current.paths.isEmpty()) {
                return null;
            }
            current = current.paths.get(0).city;
        }
        return current;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" [");

        for (int i = 0; i < paths.size(); i++) {
            Path p = paths.get(i);
            sb.append(p.city.name)
                    .append(": ")
                    .append(p.cost);

            if (i < paths.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
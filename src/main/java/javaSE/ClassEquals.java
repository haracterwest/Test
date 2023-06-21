package javaSE;

import java.util.Objects;

public class ClassEquals {
    private final String name;
    private final String text;

    public ClassEquals(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassEquals that = (ClassEquals) o;
        return name.equals(that.name) && text.equals(that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, text);
    }
}

public class BuilderPredefined {
  private String name;
  private int age;

  public static class FirstInnerClassDefined {
    private boolean injectHere = false;
  }

  public static class BuilderPredefinedBuilder {
    private int age;
    private String name;

    public void age(int age) {
      this.age = age;
    }

    @java.lang.SuppressWarnings("all")
    BuilderPredefinedBuilder() { }

    @java.lang.SuppressWarnings("all")
    public BuilderPredefinedBuilder name(final String name) {
      this.name = name;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    public BuilderPredefined build() {
      return new BuilderPredefined(name, age);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
      return "BuilderPredefined.BuilderPredefinedBuilder(name=" + this.name + ", age=" + this.age + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  BuilderPredefined(final String name, final int age) {
    this.name = name;
    this.age = age;
  }

  @java.lang.SuppressWarnings("all")
  public static BuilderPredefinedBuilder builder() {
    return new BuilderPredefinedBuilder();
  }
}

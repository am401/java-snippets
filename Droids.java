public class Droid {
  int batteryLevel;
  String name;

  public String toString() {
    return "Hello, I'm the droid: " + name;
  }
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }

  public void energyReport(int energy) {
    System.out.println("Current battery level for " + name + " is: " + energy);
  }

  public void energyTransfer(int level, Droid transferTo) {
    batteryLevel = batteryLevel - level;
    transferTo.batteryLevel += level;
  }
  // main
  public static void main(String[] args) {
    Droid r2d2 = new Droid("R2-D2");
    r2d2.energyReport(r2d2.batteryLevel);
    System.out.println(r2d2);
    r2d2.performTask("playing");
    r2d2.energyReport(r2d2.batteryLevel);
    r2d2.performTask("cleaning");
    r2d2.energyReport(r2d2.batteryLevel);

    Droid c3p0 = new Droid("C-3P0");
    c3p0.energyReport(c3p0.batteryLevel);
    System.out.println(c3p0);
    c3p0.performTask("walking");
    c3p0.performTask("running");
    c3p0.performTask("swimming");
    c3p0.energyReport(c3p0.batteryLevel);

    c3p0.energyTransfer(30, r2d2);
    c3p0.energyReport(c3p0.batteryLevel);
    r2d2.energyReport(r2d2.batteryLevel);
  }

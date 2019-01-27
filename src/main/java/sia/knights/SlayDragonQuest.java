package sia.knights;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

  private PrintStream stream;

  /**
   * 构造器，将SlayGragonQuest声明为bean
   * @param stream
   */
  public SlayDragonQuest(PrintStream stream) {
    this.stream = stream;
  }

  public void embark() {
    /**
     * 为什么stream的功能是System.out?
     */
    stream.println("Embarking on quest to slay the dragon!");
  }

}

package sia.knights;

public class DamselRescuingKnight implements Knight {


  private RescueDamselQuest quest;

  /**
   *   引入的方法为具体方式，耦合性大，参考class: BraveKnight,引入的是接口
   */

  public DamselRescuingKnight() {
    this.quest = new RescueDamselQuest();
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}

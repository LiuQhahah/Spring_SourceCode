package sia.knights;
  
public class BraveKnight implements Knight {

  private Quest quest;


  /**
   * @param quest 通过引入接口，调用接口的方法，而不是直接调用方法，解耦
   */
  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}

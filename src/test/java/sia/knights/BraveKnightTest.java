package sia.knights;
import static org.mockito.Mockito.*;

import org.junit.Test;

import sia.knights.BraveKnight;
import sia.knights.Quest;

public class BraveKnightTest {

  @Test
  public void knightShouldEmbarkOnQuest() {
    Quest mockQuest = mock(Quest.class);
    BraveKnight knight = new BraveKnight(mockQuest);
    knight.embarkOnQuest();
    knight.embarkOnQuest();
    knight.embarkOnQuest();
    knight.embarkOnQuest();
    /**
     * Quest class 中 embark() (knight.embarkOnQuest())方法调用的次数
     * 调用了1次的含义
     *
     * knight.embarkOnQuest() 执行一次，调用embark()方法一次
     * 如果测试中填入2，那么就会报错
     *
      */



    verify(mockQuest, times(4)).embark();
  }

}

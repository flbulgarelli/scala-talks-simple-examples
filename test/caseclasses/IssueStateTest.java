package caseclasses;

import static org.junit.Assert.*;

import org.junit.Test;

import caseclasses.InProgress;
import caseclasses.Resolved;

public class IssueStateTest {

  @Test
  public void test() {
    assertTrue(new Resolved("b475cd4").happyState());
    assertFalse(new InProgress(39).happyState());
  }

}

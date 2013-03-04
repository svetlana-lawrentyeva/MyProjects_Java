package taskselementary;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalTest
{  
  @Test
  public void testTask_1a_1_10()
  {
    assertEquals(10, Conditional.task_1a(1,10));
  } 
  @Test
  public void testTask_1a_10_1()
  {
    assertEquals(10, Conditional.task_1a(10,1));
  }
  @Test
  public void testTask_1a_0_0()
  {
    assertEquals(0, Conditional.task_1a(0,0));
  }
  @Test
  public void testTask_1b_1_2_3()
  {
    assertEquals(3, Conditional.task_1b(1,2,3));
  }
  @Test
  public void testTask_1b_1_3_2()
  {
    assertEquals(3, Conditional.task_1b(1,3,2));
  }
  @Test
  public void testTask_1b_3_1_2()
  {
    assertEquals(3, Conditional.task_1b(3,1,2));
  }
  @Test
  public void testTask_1c_1_2_3_4()
  {
    assertEquals(4, Conditional.task_1c(1,2,3,4));
  }
  @Test
  public void testTask_1c_1_2_4_3()
  {
    assertEquals(4, Conditional.task_1c(1,2,4,3));
  }
  @Test
  public void testTask_1c_1_4_2_3()
  {
    assertEquals(4, Conditional.task_1c(1,4,2,3));
  }
  @Test
  public void testTask_1c_4_1_2_3()
  {
    assertEquals(4, Conditional.task_1c(4,1,2,3));
  }
  @Test
  public void testTask_3a_2_3()
  {
    assertEquals(4, Conditional.task_1c(4,1,2,3));
  }
}

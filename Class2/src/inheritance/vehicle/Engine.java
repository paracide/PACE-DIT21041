package inheritance.vehicle;

import inheritance.state.EngineState;
import inheritance.state.EngineStateOff;
import inheritance.state.EngineStateOn;

public class Engine {

  private EngineState state;

  public void powerOn() {
    this.state = new EngineStateOn();
  }

  public void powerOff() {
    this.state = new EngineStateOff();
  }

  public boolean isRunning() {
    return state instanceof EngineStateOn;
  }

  public boolean isStop() {
    return state instanceof EngineStateOff;
  }
}

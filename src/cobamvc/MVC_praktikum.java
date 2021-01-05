package cobamvc;

public class MVC_praktikum {
    ViewPraktikum vp = new ViewPraktikum();
    ModelPraktikum mp = new ModelPraktikum();
    ControllerPraktikum cp = new ControllerPraktikum(vp, mp);
}

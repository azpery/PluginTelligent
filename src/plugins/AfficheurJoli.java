package plugins;

import core.interfaces.AfficheurAbstrait;

public class AfficheurJoli extends AfficheurAbstrait {
    @Override
    public void afficher(String p) {
        System.out.print("Joli :"+p);
    }
}

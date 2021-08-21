package namingConventions_packages_final_keyWords;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}

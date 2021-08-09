package Interfaces_Inner_and_abstract_classes.challenge_one;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}

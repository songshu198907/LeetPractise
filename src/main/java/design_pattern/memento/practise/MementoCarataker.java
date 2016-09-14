package design_pattern.memento.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 9/14/16.
 */
public class MementoCarataker {
    private List<Memento> mementoList;
    private int cursor;
    private int top = 0;

    public MementoCarataker() {
        cursor = -1;
        mementoList = new ArrayList<>();
        top = 0;
    }

    public void setMemento(Memento memento) {
        if (cursor == mementoList.size() - 1) {
            mementoList.add(++cursor, memento);
            top = cursor;
        } else mementoList.set(cursor++, memento);
    }

    public Memento getMemento(boolean undo) {
        if (undo) {
            if (cursor >= 0)
                return mementoList.get(cursor--);
        } else {
            if (cursor <= top) {
                return mementoList.get(cursor++);
            }
        }

        return null;
    }
}

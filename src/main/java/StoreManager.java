import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StoreManager {
    private ArrayList<Store> stores;
    private Ascending ascending;

    public StoreManager() {
        this.stores = new ArrayList<>();
        ascending = new Ascending(Alignment.None);
    }

    public void addStore(Store store){
        this.stores.add(store);
    }

    public Store findAt(String id){
        Store found = null;
        Store[] list = this.stores.toArray(new Store[this.stores.size()]);

        for (Store store : list) {
            if(store.getId().equals(id)){
                found = store;
            }

            if(store.getName().equals(id)){
                found = store;
            }
        }

        return found;
    }

    public Store[] findAll(Alignment alignment){
        Store[] list = this.stores.toArray(new Store[this.stores.size()]);
        ascending.setAlignment(alignment);
        Arrays.sort(list, ascending);
        return list;
    }

    class Ascending implements Comparator<Store> {
        private Alignment alignment;

        public Ascending(Alignment alignment) {
            this.alignment = alignment;
        }

        public void setAlignment(Alignment alignment){
            this.alignment = alignment;
        }

        @Override
        public int compare(Store o1, Store o2) {
            double compareTarget1 = 0;
            double compareTarget2 = 0;

            switch (this.alignment){
                case None:
                case Star:
                    compareTarget1 = o1.getStarAverage();
                    compareTarget2 = o2.getStarAverage();
                    break;
                case Review:
                    compareTarget1 = o1.getStarAverage();
                    compareTarget2 = o2.getStarAverage();
                    break;
                case Distance:
                    compareTarget1 = o1.getDistance();
                    compareTarget2 = o2.getDistance();
                    break;
            }

            if(compareTarget1 > compareTarget2){
                return -1;
            }
            else if(compareTarget1 == compareTarget2){
                return 0;
            }
            else if(compareTarget1 < compareTarget2){
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}


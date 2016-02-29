package Data;

/**
 * Created by drmiller on 29.02.2016.
 */
public final class RepositoryFactory {
    public static IRepository GetRepository()
    {
        return new TestRepository();
    }
}

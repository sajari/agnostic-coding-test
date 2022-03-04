using CachingExercise.Model;

namespace CachingExercise.Fetcher
{
    ///<summary>
    ///A Fetcher that can get, list, save and clear an {@link Entity}
    /// </summary>
    public interface IFetcher
    {
        /// <summary>
        /// Returns an <returns>IEntity</returns> based on the passed in <param name="id"></param> or null
        /// </summary>
        IEntity Get(long id);

        /// <summary>
        /// Saves an entity via the Fetcher, if the {@link Entity#getIdentifier()} does not exist a new entry will be created.
        /// If the {@link Entity#getIdentifier()} does exist the value will be updated
        /// </summary>
        IEntity Save(IEntity entity);
    }
}
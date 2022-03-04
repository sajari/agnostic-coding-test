using System.Collections.Generic;
using System.Threading;
using CachingExercise.Model;

namespace CachingExercise.Fetcher
{
    ///<summary>
    /// Yes, this implementation is just backed by a Dictionary, but really it might be backed by a remote store
    /// an RDBMS, REST api ... something that takes time. There is an arbitrary wait in this implementation to
    /// signify that this class is slow.
    /// </summary>
    public class RemoteStoreFetcher : IFetcher
    {
        private Dictionary<long, IEntity> _entityStore;

        public RemoteStoreFetcher(Dictionary<long, IEntity> entityStore)
        {
            _entityStore = entityStore;
        }

        public IEntity Get(long id)
        {
            Thread.Sleep(4000);
            return _entityStore.TryGetValue(id, out var value) ? value : null;
        }

        public IEntity Save(IEntity entity)
        {
            Thread.Sleep(4000);
            _entityStore.Add(entity.GetIdentifier(), entity);
            return entity;
        }

        public void Clear()
        {
            _entityStore.Clear();
        }
    }
}
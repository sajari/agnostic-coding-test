using System.Collections.Generic;
using CachingExercise.Model;

namespace CachingExercise.Fetcher
{
    ///<summary>
    /// Yes, this implementation is just backed by a Dictionary, but really it might be back by a remote store
    /// an RDBMS, REST api ... something that takes time.
    /// A simple implementation of a Fetcher backed by a Map. This
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
            return _entityStore.TryGetValue(id, out var value) ? value : null;
        }

        public IEntity Save(IEntity entity)
        {
            _entityStore.Add(entity.GetIdentifier(), entity);
            return entity;
        }

        public void Clear()
        {
            _entityStore.Clear();
        }
    }
}
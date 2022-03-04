using System;
using CachingExercise.Model;

namespace TestCachingExercise
{
    public class TestEntity : IEntity
    {
        private long _id;
        private Object _source;

        public TestEntity(long id, object source)
        {
            this._id = id;
            this._source = source;
        }

        public long GetIdentifier()
        {
            return this._id;
        }

        public object GetSource()
        {
            return this._source;
        }

        protected bool Equals(TestEntity other)
        {
            return _id == other._id && Equals(_source, other._source);
        }

        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            if (obj.GetType() != this.GetType()) return false;
            return Equals((TestEntity) obj);
        }

        public override int GetHashCode()
        {
            unchecked
            {
                return (_id.GetHashCode() * 397) ^ (_source != null ? _source.GetHashCode() : 0);
            }
        }
    }
}
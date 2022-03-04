using System;

namespace CachingExercise.Model
{
    /// <summary>
    /// An Entity with a source and identifier
    /// </summary>
    public interface IEntity
    {
        long GetIdentifier();

        Object GetSource();
    }
}
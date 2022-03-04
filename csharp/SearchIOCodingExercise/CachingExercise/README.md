# C# Coding Exercise

## Introduction

First things first, relax ... you are ***not*** going to find any trick questions here.

The goal of this coding exercise is to see how you break down a problem and solve a relatively
known problem space within industry; hopefully something you have seen or used before in your 
day-to-day work.

## The Problem

Customers are reporting that companies application is slow and the team have determined that 
calls to the `IFetcher` API is reason for the slow response times.

You have been tasked in making calls to this API return within a more appropriate time for our 
customers ... so with the guidance of the teams architect we have decided to implement a cache!

```
You cannot change the underlying implementation, since you do not have access to this source code, 
consider this a library provided to you to use. This source code is available in the test 
`RemoteStoreFetcher` but it cannot be changed.
```

## Goal

So we want you to implement a cache, we will first start simple and then add some specific semantics as we go.

The code already has two high level interfaces `IFetcher` and `IEntity`. `RemoteStoreFetcher` is also present
but this cannot be changed, as we discussed earlier. We have provided and an unimplemented class `FetcherCache`, 
we expect this should be the only class that needs to be implemented to improve the performance of the system. 

## Tests

We have provided a `TestEntity` class to help with testing as we go.

## Questions

1. Implement a simple cache for the `IFetcher`
2. Now lets enhance this cache with a FIFO caching strategy
3. Potential further questions if time allows:
   1. How would we implement an LRU cache?
   2. How could we use expiry time for the cache

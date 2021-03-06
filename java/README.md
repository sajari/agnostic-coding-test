# Java coding exercise

## Introduction

First things first, relax ... you are ***not*** going to find any trick questions here. 

The goal of this coding exercise is to see how you break down a problem and solve a relatively
known problem space, hopefully something you have seen or used before in your day-to-day work.

There is a public API of a class `Fetcher`, customers are reporting to us that this API is slow. You have been tasked in 
making this API call return within a more appropriate time for our customers ... so we have decided to implement a cache!


## Goal

We want you to implement a cache, we will first start simple and then add some specific semantics as we go.

The code already has two high level interfaces `Fetcher` and `Entity`, a basic in-memory implementation
of a `Fetcher`, `RemoteStoreFetcher` and an unimplemented `FetcherCache`.

## Building

This project uses Gradle, if you are not familar with this build tool, do not worry ... this isn't a test about build tools!

## Questions

1. Do the tests pass?
2. Implement a simple cache for the `Fetcher`
3. Enhance the Cache requirements.
   1. Add a FIFO (First in First Out) caching strategy for your `FetcherCache`
      1. Using a sizing strategy to manage cache size
      2. Use an expiry time to manage the cache
rotten-tomatoes-service
=======================

Simple service to access the Rotten Tomatoes public web services.

This service is used by applications that need to find the unique identifier
of a movie in the Rotten Tomatoes database based on a title.

It is *not* a wrapper around the *full* API of the Rotten Tomatoes 
web-services, it exposes only those services useful for identifying movies.

Usage is trivial:
```
RottenTomatoesService movieService = new JaxrsRottenTomatoesService(apiKey, requestsPerSecondLimit);
MovieSearchResults searchResults = movieService.search("Total Recall");
Movie movie = movieService.movie(770805418);
```

The service implements a simple request rate-limiting restriction. This is
specified by the `requestsPerSecondLimit` in the above code fragment.

The current limit enforced by the Rotten Tomatoes web-services is five requests
per second.

Access to Rotten Tomatoes public web-services requires an application-specific
API key. To use this service in your own application you must register at the
Rotten Tomatoes web-site and request your own API key.

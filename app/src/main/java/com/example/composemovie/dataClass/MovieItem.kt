package com.example.composemovie.dataClass

data class MovieItem(
    var adult: Boolean? = false, // false
    var backdrop_path: String? = "", // /rr7E0NoGKxvbkb89eR1GwfoYjpA.jpg
    var belongs_to_collection: Any? = Any(), // null
    var budget: Int? = 0, // 63000000
    var genres: List<Genre?>? = listOf(),
    var homepage: String? = "", // http://www.foxmovies.com/movies/fight-club
    var id: Int? = 0, // 550
    var imdb_id: String? = "", // tt0137523
    var original_language: String? = "", // en
    var original_title: String? = "", // Fight Club
    var overview: String? = "", // A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground "fight clubs" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.
    var popularity: Double? = 0.0, // 66.627
    var poster_path: String? = "", // /pB8BM7pdSp6B6Ih7QZ4DrQ3PmJK.jpg
    var production_companies: List<ProductionCompany?>? = listOf(),
    var production_countries: List<ProductionCountry?>? = listOf(),
    var release_date: String? = "", // 1999-10-15
    var revenue: Int? = 0, // 100853753
    var runtime: Int? = 0, // 139
    var spoken_languages: List<SpokenLanguage?>? = listOf(),
    var status: String? = "", // Released
    var tagline: String? = "", // Mischief. Mayhem. Soap.
    var title: String? = "", // Fight Club
    var video: Boolean? = false, // false
    var vote_average: Double? = 0.0, // 8.4
    var vote_count: Int? = 0 // 23609
) {
    data class Genre(
        var id: Int? = 0, // 18
        var name: String? = "" // Drama
    )

    data class ProductionCompany(
        var id: Int? = 0, // 508
        var logo_path: String? = "", // /7PzJdsLGlR7oW4J0J5Xcd0pHGRg.png
        var name: String? = "", // Regency Enterprises
        var origin_country: String? = "" // US
    )

    data class ProductionCountry(
        var iso_3166_1: String? = "", // DE
        var name: String? = "" // Germany
    )

    data class SpokenLanguage(
        var english_name: String? = "", // English
        var iso_639_1: String? = "", // en
        var name: String? = "" // English
    )
}
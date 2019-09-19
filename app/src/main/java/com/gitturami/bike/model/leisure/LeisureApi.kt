package com.gitturami.bike.model.leisure

import com.gitturami.bike.model.leisure.pojo.Leisure
import com.gitturami.bike.model.leisure.pojo.LeisureResponse
import com.gitturami.bike.model.leisure.pojo.LeisureResponseBody
import com.gitturami.bike.model.leisure.pojo.SummaryLeisure
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call
import io.reactivex.Observable
import io.reactivex.Single

interface LeisureApi {
    @GET("/leisure/list")
    fun getAllLeisure(): LeisureResponse

    @GET("/leisure/parks")
    fun getAllPark(): LeisureResponse

    @GET("/leisure/cultures")
    fun getAllCultures(): LeisureResponse

    @GET("/leisure/festivals")
    fun getAllFestivals(): LeisureResponse

    @GET("/leisure/leports")
    fun getAllLeports(): LeisureResponse

    @GET("/leisure/courses")
    fun getAllCourses(): LeisureResponse

    @GET("/leisure/hotels")
    fun getAllHotels(): LeisureResponse

    @GET("/leisure/shopping")
    fun getAllShopping(): LeisureResponse

    @GET("/leisure/foods")
    fun getAllFoods(): LeisureResponse

    @GET("/leisure/summaries")
    fun getLeisureSummaries(): Observable<List<SummaryLeisure>>

    @GET("/leisure/terrain/summaries")
    fun getTerrainSummaries(): Observable<List<Leisure>>

    @GET("/leisure/name")
    fun getLeisureByName(@Query("name") name : String) : Single<Leisure>
}
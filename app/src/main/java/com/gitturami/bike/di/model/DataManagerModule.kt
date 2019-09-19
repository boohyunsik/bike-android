package com.gitturami.bike.di.model

import android.content.Context
import com.gitturami.bike.model.cafe.CafeDataManager
import com.gitturami.bike.model.leisure.LeisureDataManager
import com.gitturami.bike.model.path.PathManager
import com.gitturami.bike.model.restaurant.RestaurantDataManager
import com.gitturami.bike.model.station.StationDataManager
import dagger.Module
import dagger.Provides

@Module
class DataManagerModule(val context: Context) {
    @Provides
    fun provideStationDataManager() = StationDataManager(context)

    @Provides
    fun provideRestaurantDataManager() = RestaurantDataManager(context)

    @Provides
    fun provideCafeDataManager() = CafeDataManager(context)

    @Provides
    fun provideLeisureDataManager() = LeisureDataManager(context)

    @Provides
    fun providePathManager() = PathManager(context)
}
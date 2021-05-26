package com.submission2.capstoneproject2.di

import com.submission2.capstoneproject2.ui.detail.DetailMovieActivity
import com.submission2.capstoneproject2.ui.home.HomeFragment
import com.capstoneproject2.core.di.CoreComponent
import com.capstoneproject2.core.domain.usecase.MoviesUseCase
import dagger.Component

@AppScope
@Component(modules = [ViewModelModule::class], dependencies = [CoreComponent::class])

interface AppComponent {

    fun inject(fragment: HomeFragment)
    fun inject(activity: DetailMovieActivity)

    @Component.Builder
    interface Builder {
        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): AppComponent
    }

    fun provideMoviesUseCase(): MoviesUseCase


}
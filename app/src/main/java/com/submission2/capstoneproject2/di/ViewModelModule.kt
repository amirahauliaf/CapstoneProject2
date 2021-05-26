package com.submission2.capstoneproject2.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.submission2.capstoneproject2.ui.detail.DetailMovieViewModel
import com.submission2.capstoneproject2.ui.home.HomeViewModel
import com.capstoneproject2.core.ui.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(DetailMovieViewModel::class)
    abstract fun bindDetailMoviesViewModel(viewModel: DetailMovieViewModel): ViewModel


}
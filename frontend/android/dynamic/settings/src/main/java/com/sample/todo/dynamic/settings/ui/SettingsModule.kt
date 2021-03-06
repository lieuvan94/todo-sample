package com.sample.todo.dynamic.settings.ui

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SettingsModule {
    @com.sample.todo.base.di.FragmentScope
    @ContributesAndroidInjector(
        modules = [
            SettingsBindingModule::class
        ]
    )
    abstract fun contributeSettingsFragment(): SettingsFragment
}

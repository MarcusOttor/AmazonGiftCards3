package com.freeamazongiftcards.amazoncardsgenerator.freegiftsforamazon.inject

import com.freeamazongiftcards.amazoncardsgenerator.freegiftsforamazon.core.MyApplication
import com.freeamazongiftcards.amazoncardsgenerator.freegiftsforamazon.core.services.ClaimService
import com.freeamazongiftcards.amazoncardsgenerator.freegiftsforamazon.screens.BaseActivity
import com.freeamazongiftcards.amazoncardsgenerator.freegiftsforamazon.screens.dialogs.*
import dagger.Component

@Component(modules = arrayOf(AppModule::class, MainModule::class))
interface AppComponent {

    fun inject(screen: BaseActivity)
    fun inject(app: MyApplication)
    fun inject(dialog: LoginDialog)
    fun inject(dialog: SignupDialog)
    fun inject(dialog: PromocodeDialog)
    fun inject(dialog: RedeemDialog)
    fun inject(service: ClaimService)
    fun inject(dialog: HistoryDialog)
}

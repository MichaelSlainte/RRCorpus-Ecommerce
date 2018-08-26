import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { HttpModule } from '@angular/http';
import {MatButtonModule, MatCheckboxModule} from '@angular/material';
import { routing } from './app.routing';
import { MatGridListModule } from '@angular/material/grid-list';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatDialogModule} from '@angular/material/dialog';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import {MatTabsModule} from '@angular/material/tabs';
import 'hammerjs';

import { DataTableModule } from "angular-6-datatable";
import { DataFilterPipe } from './components/product-list/data-filter.pipe';


import { LoginService } from './services/login.service';
import { UserService } from './services/user.service';
import { PaymentService } from './services/payment.service';
import { ShippingService } from './services/shipping.service';
import { ProductService } from './services/product.service';
import { CartService } from './services/cart.service';
import { OrderService } from './services/order.service';
import { CheckoutService } from './services/checkout.service';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { MyAccountComponent } from './components/my-account/my-account.component';
import { MyProfileComponent } from './components/my-profile/my-profile.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { ProductDetailComponent } from './components/product-detail/product-detail.component';
import { ShoppingCartComponent } from './components/shopping-cart/shopping-cart.component';
import { OrderComponent } from './components/order/order.component';
import { OrderSummaryComponent } from './components/order-summary/order-summary.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavBarComponent,
    MyAccountComponent,
    MyProfileComponent,
    ProductListComponent,
    DataFilterPipe,
    ProductDetailComponent,
    ShoppingCartComponent,
    OrderComponent,
    OrderSummaryComponent,
    ProductListComponent,
    DataFilterPipe
  ],
  imports: [
    BrowserModule,
    HttpModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCheckboxModule,
    routing,
    MatGridListModule,
    FormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatSlideToggleModule,
    MatDialogModule,
    DataTableModule,
    MatTabsModule,
    MatProgressSpinnerModule

  ],
  
  providers: [
    LoginService,
    UserService,
    PaymentService,
    ShippingService,
    ProductService,
    CartService,
    OrderService,
    CheckoutService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule, ErrorHandler } from '@angular/core';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { routing } from './app.routing';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatDialogModule} from '@angular/material/dialog';



import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatButtonModule, MatToolbarModule, MatIconModule, MatCardModule, MatCheckboxModule} from '@angular/material';
import 'hammerjs';


import { LoginService } from './services/login.service';
import{ AddProductService } from './services/add-product.service';
import { UploadImageService } from './services/upload-image.service';
import { GetProductListService } from './services/get-product-list.service';
import { GetProductService } from './services/get-product.service';
import { EditProductService } from './services/edit-product.service';
import { RemoveProductService } from './services/remove-product.service';


import { AppComponent} from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { LoginComponent } from './components/login/login.component';
import { AddNewProductComponent } from './components/add-new-product/add-new-product.component';
import { ProductListComponent, DialogResultExampleDialog} from './components/product-list/product-list.component';
import { ViewProductComponent } from './components/view-product/view-product.component';
import { EditProductComponent } from './components/edit-product/edit-product.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LoginComponent,
    AddNewProductComponent,
    ProductListComponent,
    ViewProductComponent,
    EditProductComponent,
    DialogResultExampleDialog
  ],
  imports: [
    BrowserModule,
    HttpModule,
    routing,
    BrowserAnimationsModule,
    MatButtonModule, 
    MatToolbarModule, 
    MatIconModule,
    MatCheckboxModule,
    MatGridListModule,
    MatFormFieldModule,
    MatInputModule,
    FormsModule,
    MatSelectModule,
    MatSlideToggleModule,
    MatDialogModule

  ],
  providers: [
    LoginService,
    AddProductService,
    UploadImageService,
    GetProductListService,
    GetProductService,
    EditProductService,
    RemoveProductService
  ],
  bootstrap: [AppComponent, DialogResultExampleDialog]
})
export class AppModule { }
